.class public final synthetic Lc6/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls6/b;


# static fields
.field public static final synthetic a:Lc6/e;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lc6/e;

    invoke-direct {v0}, Lc6/e;-><init>()V

    sput-object v0, Lc6/e;->a:Lc6/e;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->b()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    return-object v0
.end method
