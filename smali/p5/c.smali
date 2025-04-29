.class public final Lp5/c;
.super Lp5/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp5/c$a;
    }
.end annotation


# instance fields
.field private final a:I

.field private final b:Lp5/c$a;


# direct methods
.method private constructor <init>(ILp5/c$a;)V
    .locals 0

    invoke-direct {p0}, Lp5/l;-><init>()V

    iput p1, p0, Lp5/c;->a:I

    iput-object p2, p0, Lp5/c;->b:Lp5/c$a;

    return-void
.end method

.method public static a(ILp5/c$a;)Lp5/c;
    .locals 2

    const/16 v0, 0xa

    if-lt p0, v0, :cond_0

    const/16 v0, 0x10

    if-lt v0, p0, :cond_0

    new-instance v0, Lp5/c;

    invoke-direct {v0, p0, p1}, Lp5/c;-><init>(ILp5/c$a;)V

    return-object v0

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid tag size for AesCmacParameters: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Lp5/c;->a:I

    return v0
.end method

.method public c()I
    .locals 2

    iget-object v0, p0, Lp5/c;->b:Lp5/c$a;

    sget-object v1, Lp5/c$a;->e:Lp5/c$a;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lp5/c;->b()I

    move-result v0

    return v0

    :cond_0
    sget-object v1, Lp5/c$a;->b:Lp5/c$a;

    if-ne v0, v1, :cond_1

    :goto_0
    invoke-virtual {p0}, Lp5/c;->b()I

    move-result v0

    add-int/lit8 v0, v0, 0x5

    return v0

    :cond_1
    sget-object v1, Lp5/c$a;->c:Lp5/c$a;

    if-ne v0, v1, :cond_2

    goto :goto_0

    :cond_2
    sget-object v1, Lp5/c$a;->d:Lp5/c$a;

    if-ne v0, v1, :cond_3

    goto :goto_0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unknown variant"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public d()Lp5/c$a;
    .locals 1

    iget-object v0, p0, Lp5/c;->b:Lp5/c$a;

    return-object v0
.end method

.method public e()Z
    .locals 2

    iget-object v0, p0, Lp5/c;->b:Lp5/c$a;

    sget-object v1, Lp5/c$a;->e:Lp5/c$a;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lp5/c;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lp5/c;

    invoke-virtual {p1}, Lp5/c;->c()I

    move-result v0

    invoke-virtual {p0}, Lp5/c;->c()I

    move-result v2

    if-ne v0, v2, :cond_1

    invoke-virtual {p1}, Lp5/c;->d()Lp5/c$a;

    move-result-object p1

    invoke-virtual {p0}, Lp5/c;->d()Lp5/c$a;

    move-result-object v0

    if-ne p1, v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    iget v1, p0, Lp5/c;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lp5/c;->b:Lp5/c$a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AES-CMAC Parameters (variant: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lp5/c;->b:Lp5/c$a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lp5/c;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "-byte tags)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
