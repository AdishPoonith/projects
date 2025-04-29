.class public final Lw5/n$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw5/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lw5/n;
    .locals 10

    new-instance v9, Lw5/n;

    iget-object v1, p0, Lw5/n$b;->b:Ljava/lang/String;

    iget-object v2, p0, Lw5/n$b;->a:Ljava/lang/String;

    iget-object v3, p0, Lw5/n$b;->c:Ljava/lang/String;

    iget-object v4, p0, Lw5/n$b;->d:Ljava/lang/String;

    iget-object v5, p0, Lw5/n$b;->e:Ljava/lang/String;

    iget-object v6, p0, Lw5/n$b;->f:Ljava/lang/String;

    iget-object v7, p0, Lw5/n$b;->g:Ljava/lang/String;

    const/4 v8, 0x0

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lw5/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lw5/n$a;)V

    return-object v9
.end method

.method public b(Ljava/lang/String;)Lw5/n$b;
    .locals 1

    const-string v0, "ApiKey must be set."

    invoke-static {p1, v0}, Lc4/s;->g(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lw5/n$b;->a:Ljava/lang/String;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lw5/n$b;
    .locals 1

    const-string v0, "ApplicationId must be set."

    invoke-static {p1, v0}, Lc4/s;->g(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lw5/n$b;->b:Ljava/lang/String;

    return-object p0
.end method

.method public d(Ljava/lang/String;)Lw5/n$b;
    .locals 0

    iput-object p1, p0, Lw5/n$b;->c:Ljava/lang/String;

    return-object p0
.end method

.method public e(Ljava/lang/String;)Lw5/n$b;
    .locals 0

    iput-object p1, p0, Lw5/n$b;->d:Ljava/lang/String;

    return-object p0
.end method

.method public f(Ljava/lang/String;)Lw5/n$b;
    .locals 0

    iput-object p1, p0, Lw5/n$b;->e:Ljava/lang/String;

    return-object p0
.end method

.method public g(Ljava/lang/String;)Lw5/n$b;
    .locals 0

    iput-object p1, p0, Lw5/n$b;->g:Ljava/lang/String;

    return-object p0
.end method

.method public h(Ljava/lang/String;)Lw5/n$b;
    .locals 0

    iput-object p1, p0, Lw5/n$b;->f:Ljava/lang/String;

    return-object p0
.end method
