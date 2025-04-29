.class public final synthetic Lw1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp3/h;


# static fields
.field public static final synthetic a:Lw1/d;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lw1/d;

    invoke-direct {v0}, Lw1/d;-><init>()V

    sput-object v0, Lw1/d;->a:Lw1/d;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lw1/w$a;

    invoke-virtual {p1}, Lw1/w$a;->h()V

    return-void
.end method
