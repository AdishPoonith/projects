.class public Lx6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx6/a$b;,
        Lx6/a$a;
    }
.end annotation


# static fields
.field private static final c:Lx6/a;


# instance fields
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Lx6/a$a;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx6/a;

    invoke-direct {v0}, Lx6/a;-><init>()V

    sput-object v0, Lx6/a;->c:Lx6/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lx6/a;->a:Ljava/util/Map;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lx6/a;->b:Ljava/lang/Object;

    return-void
.end method

.method public static a()Lx6/a;
    .locals 1

    sget-object v0, Lx6/a;->c:Lx6/a;

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lx6/a;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lx6/a;->a:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx6/a$a;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lx6/a$a;->a()Landroid/app/Activity;

    move-result-object v1

    invoke-static {v1}, Lx6/a$b;->b(Landroid/app/Activity;)Lx6/a$b;

    move-result-object v1

    invoke-virtual {v1, p1}, Lx6/a$b;->c(Lx6/a$a;)V

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public c(Landroid/app/Activity;Ljava/lang/Object;Ljava/lang/Runnable;)V
    .locals 2

    iget-object v0, p0, Lx6/a;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    new-instance v1, Lx6/a$a;

    invoke-direct {v1, p1, p3, p2}, Lx6/a$a;-><init>(Landroid/app/Activity;Ljava/lang/Runnable;Ljava/lang/Object;)V

    invoke-static {p1}, Lx6/a$b;->b(Landroid/app/Activity;)Lx6/a$b;

    move-result-object p1

    invoke-virtual {p1, v1}, Lx6/a$b;->a(Lx6/a$a;)V

    iget-object p1, p0, Lx6/a;->a:Ljava/util/Map;

    invoke-interface {p1, p2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
