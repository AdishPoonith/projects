.class public final Li9/c0;
.super Li9/f1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li9/c0$b;
    }
.end annotation


# instance fields
.field private final j:Ljava/net/SocketAddress;

.field private final k:Ljava/net/InetSocketAddress;

.field private final l:Ljava/lang/String;

.field private final m:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/net/SocketAddress;Ljava/net/InetSocketAddress;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Li9/f1;-><init>()V

    const-string v0, "proxyAddress"

    invoke-static {p1, v0}, Lb5/n;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "targetAddress"

    invoke-static {p2, v0}, Lb5/n;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    instance-of v0, p1, Ljava/net/InetSocketAddress;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/net/InetSocketAddress;

    invoke-virtual {v0}, Ljava/net/InetSocketAddress;->isUnresolved()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "The proxy address %s is not resolved"

    invoke-static {v0, v1, p1}, Lb5/n;->w(ZLjava/lang/String;Ljava/lang/Object;)V

    :cond_0
    iput-object p1, p0, Li9/c0;->j:Ljava/net/SocketAddress;

    iput-object p2, p0, Li9/c0;->k:Ljava/net/InetSocketAddress;

    iput-object p3, p0, Li9/c0;->l:Ljava/lang/String;

    iput-object p4, p0, Li9/c0;->m:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Ljava/net/SocketAddress;Ljava/net/InetSocketAddress;Ljava/lang/String;Ljava/lang/String;Li9/c0$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Li9/c0;-><init>(Ljava/net/SocketAddress;Ljava/net/InetSocketAddress;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static e()Li9/c0$b;
    .locals 2

    new-instance v0, Li9/c0$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Li9/c0$b;-><init>(Li9/c0$a;)V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Li9/c0;->m:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/net/SocketAddress;
    .locals 1

    iget-object v0, p0, Li9/c0;->j:Ljava/net/SocketAddress;

    return-object v0
.end method

.method public c()Ljava/net/InetSocketAddress;
    .locals 1

    iget-object v0, p0, Li9/c0;->k:Ljava/net/InetSocketAddress;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Li9/c0;->l:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Li9/c0;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Li9/c0;

    iget-object v0, p0, Li9/c0;->j:Ljava/net/SocketAddress;

    iget-object v2, p1, Li9/c0;->j:Ljava/net/SocketAddress;

    invoke-static {v0, v2}, Lb5/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Li9/c0;->k:Ljava/net/InetSocketAddress;

    iget-object v2, p1, Li9/c0;->k:Ljava/net/InetSocketAddress;

    invoke-static {v0, v2}, Lb5/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Li9/c0;->l:Ljava/lang/String;

    iget-object v2, p1, Li9/c0;->l:Ljava/lang/String;

    invoke-static {v0, v2}, Lb5/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Li9/c0;->m:Ljava/lang/String;

    iget-object p1, p1, Li9/c0;->m:Ljava/lang/String;

    invoke-static {v0, p1}, Lb5/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Li9/c0;->j:Ljava/net/SocketAddress;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Li9/c0;->k:Ljava/net/InetSocketAddress;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Li9/c0;->l:Ljava/lang/String;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-object v1, p0, Li9/c0;->m:Ljava/lang/String;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    invoke-static {v0}, Lb5/j;->b([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lb5/h;->c(Ljava/lang/Object;)Lb5/h$b;

    move-result-object v0

    iget-object v1, p0, Li9/c0;->j:Ljava/net/SocketAddress;

    const-string v2, "proxyAddr"

    invoke-virtual {v0, v2, v1}, Lb5/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lb5/h$b;

    move-result-object v0

    iget-object v1, p0, Li9/c0;->k:Ljava/net/InetSocketAddress;

    const-string v2, "targetAddr"

    invoke-virtual {v0, v2, v1}, Lb5/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lb5/h$b;

    move-result-object v0

    iget-object v1, p0, Li9/c0;->l:Ljava/lang/String;

    const-string v2, "username"

    invoke-virtual {v0, v2, v1}, Lb5/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lb5/h$b;

    move-result-object v0

    iget-object v1, p0, Li9/c0;->m:Ljava/lang/String;

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "hasPassword"

    invoke-virtual {v0, v2, v1}, Lb5/h$b;->e(Ljava/lang/String;Z)Lb5/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lb5/h$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
