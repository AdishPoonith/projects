.class public final synthetic Lm6/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic j:Lm6/o;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lm6/o;

    invoke-direct {v0}, Lm6/o;-><init>()V

    sput-object v0, Lm6/o;->j:Lm6/o;

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

    check-cast p1, Lm6/q;

    check-cast p2, Lm6/q;

    invoke-static {p1, p2}, Lm6/q;->a(Lm6/q;Lm6/q;)I

    move-result p1

    return p1
.end method
