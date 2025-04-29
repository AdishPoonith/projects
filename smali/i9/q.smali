.class public final Li9/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Li9/p;

.field private final b:Li9/j1;


# direct methods
.method private constructor <init>(Li9/p;Li9/j1;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "state is null"

    invoke-static {p1, v0}, Lb5/n;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li9/p;

    iput-object p1, p0, Li9/q;->a:Li9/p;

    const-string p1, "status is null"

    invoke-static {p2, p1}, Lb5/n;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li9/j1;

    iput-object p1, p0, Li9/q;->b:Li9/j1;

    return-void
.end method

.method public static a(Li9/p;)Li9/q;
    .locals 2

    sget-object v0, Li9/p;->l:Li9/p;

    if-eq p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "state is TRANSIENT_ERROR. Use forError() instead"

    invoke-static {v0, v1}, Lb5/n;->e(ZLjava/lang/Object;)V

    new-instance v0, Li9/q;

    sget-object v1, Li9/j1;->f:Li9/j1;

    invoke-direct {v0, p0, v1}, Li9/q;-><init>(Li9/p;Li9/j1;)V

    return-object v0
.end method

.method public static b(Li9/j1;)Li9/q;
    .locals 2

    invoke-virtual {p0}, Li9/j1;->o()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "The error status must not be OK"

    invoke-static {v0, v1}, Lb5/n;->e(ZLjava/lang/Object;)V

    new-instance v0, Li9/q;

    sget-object v1, Li9/p;->l:Li9/p;

    invoke-direct {v0, v1, p0}, Li9/q;-><init>(Li9/p;Li9/j1;)V

    return-object v0
.end method


# virtual methods
.method public c()Li9/p;
    .locals 1

    iget-object v0, p0, Li9/q;->a:Li9/p;

    return-object v0
.end method

.method public d()Li9/j1;
    .locals 1

    iget-object v0, p0, Li9/q;->b:Li9/j1;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Li9/q;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Li9/q;

    iget-object v0, p0, Li9/q;->a:Li9/p;

    iget-object v2, p1, Li9/q;->a:Li9/p;

    invoke-virtual {v0, v2}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Li9/q;->b:Li9/j1;

    iget-object p1, p1, Li9/q;->b:Li9/j1;

    invoke-virtual {v0, p1}, Li9/j1;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Li9/q;->a:Li9/p;

    invoke-virtual {v0}, Ljava/lang/Enum;->hashCode()I

    move-result v0

    iget-object v1, p0, Li9/q;->b:Li9/j1;

    invoke-virtual {v1}, Li9/j1;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Li9/q;->b:Li9/j1;

    invoke-virtual {v0}, Li9/j1;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Li9/q;->a:Li9/p;

    invoke-virtual {v0}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Li9/q;->a:Li9/p;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Li9/q;->b:Li9/j1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
