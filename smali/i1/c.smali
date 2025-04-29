.class public final synthetic Li1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic j:Li1/c;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Li1/c;

    invoke-direct {v0}, Li1/c;-><init>()V

    sput-object v0, Li1/c;->j:Li1/c;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lh1/c;

    check-cast p2, Lh1/c;

    invoke-static {p1, p2}, Li1/e;->b(Lh1/c;Lh1/c;)I

    move-result p1

    return p1
.end method
