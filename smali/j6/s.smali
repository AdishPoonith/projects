.class public final synthetic Lj6/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/Continuation;


# static fields
.field public static final synthetic a:Lj6/s;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lj6/s;

    invoke-direct {v0}, Lj6/s;-><init>()V

    sput-object v0, Lj6/s;->a:Lj6/s;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Lj6/p0;->a(Lcom/google/android/gms/tasks/Task;)Lm6/i;

    move-result-object p1

    return-object p1
.end method
