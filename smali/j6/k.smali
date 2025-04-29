.class public final synthetic Lj6/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq6/t;


# static fields
.field public static final synthetic a:Lj6/k;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lj6/k;

    invoke-direct {v0}, Lj6/k;-><init>()V

    sput-object v0, Lj6/k;->a:Lj6/k;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lj6/q;

    invoke-static {p1}, Lj6/l;->f(Lj6/q;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
