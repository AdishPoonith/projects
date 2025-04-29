.class final Lp6/v0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp6/v0$a;,
        Lp6/v0$b;
    }
.end annotation


# static fields
.field private static final b:Lp6/v0;


# instance fields
.field private final a:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lp6/v0$b;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp6/v0;

    invoke-direct {v0}, Lp6/v0;-><init>()V

    sput-object v0, Lp6/v0;->b:Lp6/v0;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lp6/v0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    return-void
.end method

.method public static synthetic a(Ljava/util/concurrent/atomic/AtomicReference;Lp6/v0$a;)V
    .locals 0

    invoke-static {p0, p1}, Lp6/v0;->c(Ljava/util/concurrent/atomic/AtomicReference;Lp6/v0$a;)V

    return-void
.end method

.method static b()Lp6/v0;
    .locals 1

    sget-object v0, Lp6/v0;->b:Lp6/v0;

    return-object v0
.end method

.method private static synthetic c(Ljava/util/concurrent/atomic/AtomicReference;Lp6/v0$a;)V
    .locals 0

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lp6/v0$b;

    if-eqz p0, :cond_0

    invoke-interface {p0, p1}, Lp6/v0$b;->a(Lp6/v0$a;)V

    :cond_0
    return-void
.end method


# virtual methods
.method d(Lp6/v0$a;)V
    .locals 4

    iget-object v0, p0, Lp6/v0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v2, Lq6/p;->c:Ljava/util/concurrent/Executor;

    new-instance v3, Lp6/u0;

    invoke-direct {v3, v1, p1}, Lp6/u0;-><init>(Ljava/util/concurrent/atomic/AtomicReference;Lp6/v0$a;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    return-void
.end method
