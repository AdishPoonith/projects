.class public final synthetic Lm6/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic j:Lm6/k;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lm6/k;

    invoke-direct {v0}, Lm6/k;-><init>()V

    sput-object v0, Lm6/k;->j:Lm6/k;

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

    check-cast p1, Lm6/l;

    check-cast p2, Lm6/l;

    invoke-virtual {p1, p2}, Lm6/l;->g(Lm6/l;)I

    move-result p1

    return p1
.end method
