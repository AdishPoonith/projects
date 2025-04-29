.class public final Li9/m;
.super Li9/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li9/m$a;,
        Li9/m$b;
    }
.end annotation


# instance fields
.field private final a:Li9/b;

.field private final b:Li9/b;


# direct methods
.method public constructor <init>(Li9/b;Li9/b;)V
    .locals 1

    invoke-direct {p0}, Li9/b;-><init>()V

    const-string v0, "creds1"

    invoke-static {p1, v0}, Lb5/n;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li9/b;

    iput-object p1, p0, Li9/m;->a:Li9/b;

    const-string p1, "creds2"

    invoke-static {p2, p1}, Lb5/n;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li9/b;

    iput-object p1, p0, Li9/m;->b:Li9/b;

    return-void
.end method

.method static synthetic b(Li9/m;)Li9/b;
    .locals 0

    iget-object p0, p0, Li9/m;->b:Li9/b;

    return-object p0
.end method


# virtual methods
.method public a(Li9/b$b;Ljava/util/concurrent/Executor;Li9/b$a;)V
    .locals 8

    iget-object v0, p0, Li9/m;->a:Li9/b;

    new-instance v7, Li9/m$b;

    invoke-static {}, Li9/r;->e()Li9/r;

    move-result-object v6

    move-object v1, v7

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, Li9/m$b;-><init>(Li9/m;Li9/b$b;Ljava/util/concurrent/Executor;Li9/b$a;Li9/r;)V

    invoke-virtual {v0, p1, p2, v7}, Li9/b;->a(Li9/b$b;Ljava/util/concurrent/Executor;Li9/b$a;)V

    return-void
.end method
