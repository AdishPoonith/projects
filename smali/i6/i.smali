.class public Li6/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li6/c;


# instance fields
.field private final a:Lj6/g1;

.field private final b:Lj6/b1$a;


# direct methods
.method public constructor <init>(Lj6/g1;Lj6/b1$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li6/i;->a:Lj6/g1;

    iput-object p2, p0, Li6/i;->b:Lj6/b1$a;

    return-void
.end method


# virtual methods
.method public a()Lj6/b1$a;
    .locals 1

    iget-object v0, p0, Li6/i;->b:Lj6/b1$a;

    return-object v0
.end method

.method public b()Lj6/g1;
    .locals 1

    iget-object v0, p0, Li6/i;->a:Lj6/g1;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Li6/i;

    iget-object v2, p0, Li6/i;->a:Lj6/g1;

    iget-object v3, p1, Li6/i;->a:Lj6/g1;

    invoke-virtual {v2, v3}, Lj6/g1;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    iget-object v2, p0, Li6/i;->b:Lj6/b1$a;

    iget-object p1, p1, Li6/i;->b:Lj6/b1$a;

    if-ne v2, p1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_4
    :goto_1
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Li6/i;->a:Lj6/g1;

    invoke-virtual {v0}, Lj6/g1;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Li6/i;->b:Lj6/b1$a;

    invoke-virtual {v1}, Ljava/lang/Enum;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
