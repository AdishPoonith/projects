.class public final synthetic Lp0/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# static fields
.field public static final synthetic a:Lp0/d0;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lp0/d0;

    invoke-direct {v0}, Lp0/d0;-><init>()V

    sput-object v0, Lp0/d0;->a:Lp0/d0;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lp0/f0;->h()Ljava/io/File;

    move-result-object v0

    return-object v0
.end method
