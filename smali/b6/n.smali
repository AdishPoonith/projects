.class public final synthetic Lb6/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls6/b;


# static fields
.field public static final synthetic a:Lb6/n;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lb6/n;

    invoke-direct {v0}, Lb6/n;-><init>()V

    sput-object v0, Lb6/n;->a:Lb6/n;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
