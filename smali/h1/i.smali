.class public final synthetic Lh1/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/FilenameFilter;


# static fields
.field public static final synthetic a:Lh1/i;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lh1/i;

    invoke-direct {v0}, Lh1/i;-><init>()V

    sput-object v0, Lh1/i;->a:Lh1/i;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/io/File;Ljava/lang/String;)Z
    .locals 0

    invoke-static {p1, p2}, Lh1/k;->b(Ljava/io/File;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
