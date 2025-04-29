.class public Lj6/a1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj6/a1$a;
    }
.end annotation


# instance fields
.field private final a:Lj6/a1$a;

.field final b:Lm6/r;


# direct methods
.method private constructor <init>(Lj6/a1$a;Lm6/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj6/a1;->a:Lj6/a1$a;

    iput-object p2, p0, Lj6/a1;->b:Lm6/r;

    return-void
.end method

.method public static d(Lj6/a1$a;Lm6/r;)Lj6/a1;
    .locals 1

    new-instance v0, Lj6/a1;

    invoke-direct {v0, p0, p1}, Lj6/a1;-><init>(Lj6/a1$a;Lm6/r;)V

    return-object v0
.end method


# virtual methods
.method a(Lm6/i;Lm6/i;)I
    .locals 3

    iget-object v0, p0, Lj6/a1;->b:Lm6/r;

    sget-object v1, Lm6/r;->k:Lm6/r;

    invoke-virtual {v0, v1}, Lm6/e;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lj6/a1;->a:Lj6/a1$a;

    invoke-virtual {v0}, Lj6/a1$a;->b()I

    move-result v0

    invoke-interface {p1}, Lm6/i;->getKey()Lm6/l;

    move-result-object p1

    invoke-interface {p2}, Lm6/i;->getKey()Lm6/l;

    move-result-object p2

    invoke-virtual {p1, p2}, Lm6/l;->g(Lm6/l;)I

    move-result p1

    :goto_0
    mul-int v0, v0, p1

    return v0

    :cond_0
    iget-object v0, p0, Lj6/a1;->b:Lm6/r;

    invoke-interface {p1, v0}, Lm6/i;->b(Lm6/r;)Ld7/b0;

    move-result-object p1

    iget-object v0, p0, Lj6/a1;->b:Lm6/r;

    invoke-interface {p2, v0}, Lm6/i;->b(Lm6/r;)Ld7/b0;

    move-result-object p2

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    new-array v0, v0, [Ljava/lang/Object;

    const-string v2, "Trying to compare documents on fields that don\'t exist."

    invoke-static {v1, v2, v0}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lj6/a1;->a:Lj6/a1$a;

    invoke-virtual {v0}, Lj6/a1$a;->b()I

    move-result v0

    invoke-static {p1, p2}, Lm6/y;->i(Ld7/b0;Ld7/b0;)I

    move-result p1

    goto :goto_0
.end method

.method public b()Lj6/a1$a;
    .locals 1

    iget-object v0, p0, Lj6/a1;->a:Lj6/a1$a;

    return-object v0
.end method

.method public c()Lm6/r;
    .locals 1

    iget-object v0, p0, Lj6/a1;->b:Lm6/r;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    instance-of v1, p1, Lj6/a1;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    check-cast p1, Lj6/a1;

    iget-object v1, p0, Lj6/a1;->a:Lj6/a1$a;

    iget-object v2, p1, Lj6/a1;->a:Lj6/a1$a;

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Lj6/a1;->b:Lm6/r;

    iget-object p1, p1, Lj6/a1;->b:Lm6/r;

    invoke-virtual {v1, p1}, Lm6/e;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    :cond_1
    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lj6/a1;->a:Lj6/a1$a;

    invoke-virtual {v0}, Ljava/lang/Enum;->hashCode()I

    move-result v0

    const/16 v1, 0x383

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lj6/a1;->b:Lm6/r;

    invoke-virtual {v0}, Lm6/e;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lj6/a1;->a:Lj6/a1$a;

    sget-object v2, Lj6/a1$a;->k:Lj6/a1$a;

    if-ne v1, v2, :cond_0

    const-string v1, ""

    goto :goto_0

    :cond_0
    const-string v1, "-"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lj6/a1;->b:Lm6/r;

    invoke-virtual {v1}, Lm6/r;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
