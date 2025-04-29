.class public Ly6/h;
.super Ly6/f;
.source "SourceFile"


# static fields
.field public static o:Z = false


# instance fields
.field private final n:Landroid/net/Uri;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lx6/h;Lw5/f;Landroid/net/Uri;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ly6/f;-><init>(Lx6/h;Lw5/f;)V

    const/4 p1, 0x1

    sput-boolean p1, Ly6/h;->o:Z

    iput-object p3, p0, Ly6/h;->n:Landroid/net/Uri;

    const-string p1, "X-Goog-Upload-Protocol"

    const-string p2, "resumable"

    invoke-super {p0, p1, p2}, Ly6/e;->H(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "X-Goog-Upload-Command"

    const-string p2, "cancel"

    invoke-super {p0, p1, p2}, Ly6/e;->H(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected e()Ljava/lang/String;
    .locals 1

    const-string v0, "POST"

    return-object v0
.end method

.method public v()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Ly6/h;->n:Landroid/net/Uri;

    return-object v0
.end method
