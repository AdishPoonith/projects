.class public final synthetic Ln3/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic j:Ln3/q;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ln3/q;

    invoke-direct {v0}, Ln3/q;-><init>()V

    sput-object v0, Ln3/q;->j:Ln3/q;

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

    check-cast p1, Ln3/m$i;

    check-cast p2, Ln3/m$i;

    invoke-static {p1, p2}, Ln3/m$i;->h(Ln3/m$i;Ln3/m$i;)I

    move-result p1

    return p1
.end method
