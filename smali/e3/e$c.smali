.class final Le3/e$c;
.super Ld3/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le3/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# instance fields
.field private o:Lv1/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv1/h$a<",
            "Le3/e$c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lv1/h$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv1/h$a<",
            "Le3/e$c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ld3/m;-><init>()V

    iput-object p1, p0, Le3/e$c;->o:Lv1/h$a;

    return-void
.end method


# virtual methods
.method public final w()V
    .locals 1

    iget-object v0, p0, Le3/e$c;->o:Lv1/h$a;

    invoke-interface {v0, p0}, Lv1/h$a;->a(Lv1/h;)V

    return-void
.end method
