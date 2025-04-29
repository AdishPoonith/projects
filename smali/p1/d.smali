.class public final Lp1/d;
.super Lq/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp1/d$a;
    }
.end annotation


# static fields
.field public static final k:Lp1/d$a;

.field private static l:Lq/c;

.field private static m:Lq/f;

.field private static final n:Ljava/util/concurrent/locks/ReentrantLock;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lp1/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lp1/d$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lp1/d;->k:Lp1/d$a;

    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    sput-object v0, Lp1/d;->n:Ljava/util/concurrent/locks/ReentrantLock;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lq/e;-><init>()V

    return-void
.end method

.method public static final synthetic c()Lq/c;
    .locals 1

    sget-object v0, Lp1/d;->l:Lq/c;

    return-object v0
.end method

.method public static final synthetic d()Ljava/util/concurrent/locks/ReentrantLock;
    .locals 1

    sget-object v0, Lp1/d;->n:Ljava/util/concurrent/locks/ReentrantLock;

    return-object v0
.end method

.method public static final synthetic e()Lq/f;
    .locals 1

    sget-object v0, Lp1/d;->m:Lq/f;

    return-object v0
.end method

.method public static final synthetic f(Lq/f;)V
    .locals 0

    sput-object p0, Lp1/d;->m:Lq/f;

    return-void
.end method


# virtual methods
.method public a(Landroid/content/ComponentName;Lq/c;)V
    .locals 2

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "newClient"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    invoke-virtual {p2, v0, v1}, Lq/c;->f(J)Z

    sget-object p1, Lp1/d;->k:Lp1/d$a;

    sput-object p2, Lp1/d;->l:Lq/c;

    invoke-static {p1}, Lp1/d$a;->a(Lp1/d$a;)V

    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    const-string v0, "componentName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
