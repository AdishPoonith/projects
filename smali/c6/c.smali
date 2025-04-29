.class public final synthetic Lc6/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb6/h;


# static fields
.field public static final synthetic a:Lc6/c;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lc6/c;

    invoke-direct {v0}, Lc6/c;-><init>()V

    sput-object v0, Lc6/c;->a:Lc6/c;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lb6/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->f(Lb6/e;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p1

    return-object p1
.end method
