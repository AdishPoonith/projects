.class public final synthetic Ll6/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic j:Ll6/d;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ll6/d;

    invoke-direct {v0}, Ll6/d;-><init>()V

    sput-object v0, Ll6/d;->j:Ll6/d;

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

    check-cast p1, Ll6/e;

    check-cast p2, Ll6/e;

    invoke-static {p1, p2}, Ll6/e;->b(Ll6/e;Ll6/e;)I

    move-result p1

    return p1
.end method
